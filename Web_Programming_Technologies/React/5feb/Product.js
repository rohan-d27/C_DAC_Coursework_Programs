import React from 'react';

class Product extends React.Component {
    state = { id: '', name: '', cost: '', description: '', expirydate: '', data: [] }
    property=''
    componentDidMount() {
        var promise = fetch("http://localhost:8080/product/showall", {
            "method": "GET",
        })
        var promise2 = promise.then(response => {
            return response.json()
        })
        promise2.then(jasonDataArr => {
            this.setState({ data: jasonDataArr })
        })

        promise.catch(err => {
            console.log(err);
        });

    }

    insertProduct = (id, name, cost, description, expirydate) => {
        let url = `http://localhost:8080/product/add/${id}/${name}/${cost}/${description}/${expirydate}`
        var promise = fetch(url, { "method": "POST" }).then( this.reRender())
        promise.catch(err => {
            console.log(err);
        })
       
    }
   /* reRender = () => {
         var promise2 = 
        fetch("http://localhost:8080/product/showall", {
              "method": "GET",
          })
          var promise3 = promise2.
          then(response => {
              return response.json()
          })
          promise3.then(jasonDataArr => {
              this.setState({ data: jasonDataArr })
          })
          promise2.catch(err => {
              console.log(err);
          });
      } 
  */
    reRender = () => {
     
      fetch("http://localhost:8080/product/showall", {
            "method": "GET",
        }).then(response => {
            return response.json()
        }).then(jasonDataArr => {
            this.setState({ data: jasonDataArr })
        }).catch(err => {
            console.log(err);
        });
    } 


    updateProduct = (index, id, newvalue,property) => {
        let i = index
        let url = `http://localhost:8080/product/update/${id}/${property}/${newvalue}`
        var promise = fetch(url, {
            "method": "PUT",
        }).then( this.reRender())
        var temp = this.state.data
        if(property ==="name")
              {
                  temp[i].name=newvalue
              }
              else if(property ==="cost")
              {
                  temp[i].cost=newvalue
              }
              else if(property ==="desc")
              {
                temp[i].description=newvalue 
              }
                    
        this.setState({ data: temp })
    }


    deleteProduct = (i, id) => {
        var temp = this.state.data
        temp.splice(i, 1)
        this.setState({ data: temp })
        let url = `http://localhost:8080/product/remove/${id}`
        var promise = fetch(url, {
            "method": "DELETE"
        }).then( this.reRender())
        promise.catch(err => {
            console.log(err);
        })
    }

    render() {
        return (<div><AddProduct add={this.insertProduct}></AddProduct>
            {this.state.data.forEach((e) => { console.log(e) })}

            {
                this.state.data.map((e, i) => { return (<Rows data={e} delete={this.deleteProduct} index={i} update={this.updateProduct} ></Rows>) })}
        </div>)
    }

}


class Rows extends React.Component {

    state = { readOnlyFlag: true }
    render() {
        return (
            <table border="1" className='table'>
                <tbody>
                    <tr  ><td><input className='c1' value={this.props.data.id} /></td>

                        <td><input className='c1' defaultValue={this.props.data.name} readOnly={this.state.readOnlyFlag} onBlur={(e) => this.props.update(this.props.index, this.props.data.id, e.target.value, "name")} /></td>

                        <td><input className='c1' defaultValue={this.props.data.cost} readOnly={this.state.readOnlyFlag} onBlur={(e) => this.props.update(this.props.index, this.props.data.id, e.target.value, "cost")} /></td>

                        <td><input className='c1' defaultValue={this.props.data.description} readOnly={this.state.readOnlyFlag} onBlur={(e) => this.props.update(this.props.index, this.props.data.id, e.target.value, "desc")} /></td>

                        <td><input className='c1' defaultValue={this.props.data.expirydate} readOnly={this.state.readOnlyFlag} /></td>

                        <td> <button onClick={() => this.props.delete(this.props.index, this.props.data.id)}>Delete</button> </td>
                        <td>  <button onClick={() => { this.setState({ readOnlyFlag: false }) }} >Update</button></td> </tr>
                </tbody>
            </table>
        )
    }
}
function AddProduct(props) {
    let id = 0
    let name = ''
    let cost = 0
    let date = ''
    let description = ''

    return (<div>
        id : <input type="number" onBlur={(e) => { id = e.target.value }} ></input>
        <br></br>
        name : <input type="text" onBlur={(e) => { name = e.target.value }} ></input>
        <br></br>
        description : <input type="text" onBlur={(e) => { description = e.target.value }} ></input>
        <br></br>
        cost : <input type="number" onBlur={(e) => { cost = e.target.value }} ></input>
        <br></br>
        expirydate: <input type="date" onBlur={(e) => { date = e.target.value }} ></input>
        <br></br>

        <button onClick={() => props.add(id, name, cost, description, date)}>AddProduct</button>
    </div>)
}
export default Product

