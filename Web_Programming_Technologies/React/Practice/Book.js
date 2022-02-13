import React, { Component } from 'react'

export default class Book extends Component {
    state = { ids:'',name:'',cost:'',data: [] ,flag:false,showUpdate:false}

    showBooks = () => {
        fetch("http://localhost:8080/book/getAll", {
            "method": "GET",
        }).then(response => {
            return response.json()
        }).then(jasonDataArr => {
            this.setState({ data: jasonDataArr })
        }).catch(err => console.log(err)).then(
            this.setState({flag:true})
        )

    }
    createTable = () => {
        var table = this.state.data.map((e, i) => {
            return (
                <tr key={i}><td>{i+1}</td><td>{e.id}</td><td>{e.bookName}</td><td>{e.cost}</td><td>{<button onClick={() => {  this.setState({name:e.bookName,cost:e.cost,ids:e.id,showUpdate:true}) }}>Edit</button>}</td><td>{<button onClick={() => { this.deleteData(e.id) }}>Delete</button>}</td></tr>)
        })
        return table;
    }
   /* updateHandle=(e)=>{
        this.setState({name:e.bookName,cost:e.cost,ids:e.id,showUpdate:true})
        console.log(e.id,this.state.ids);
    }*/

    updateData = () => {
        
      fetch(`http://localhost:8080/book/update`,{
          "method":"Put",
          "headers":{'Content-Type':'Application/Json'},
          "body":JSON.stringify(
              {
                  id:Number(this.state.ids),
                  bookName:this.state.name,
                  cost:this.state.cost
              }
          )
      }).then(this.reRender())

      
    }
    reRender = () => {
     
        fetch("http://localhost:8080/book/getAll", {
              "method": "GET",
          }).then(response => {
              return response.json()
          }).then(jasonDataArr => {
              this.setState({ data: jasonDataArr })
          }).catch(err => {
              console.log(err);
          });
      } 
  
    deleteData = (id) => {
        fetch ( `http://localhost:8080/book/delete/${id}`, {
            "method": "Delete"

        })


    }
       

    render() {
        return (
            <div>
                <button  onClick={this.showBooks} >Show Book</button>
                <div>
                    {this.state.flag?<table border="1">
                        <tbody>
                            <tr><th>Sr.No</th><th>Id</th><th>Name</th><th>Cost</th><th>Edit</th><th>Delete</th></tr>
                            {this.createTable()}
                        </tbody>
                    </table>:null}
                </div>
            {this.state.showUpdate? <div>
                
                   Book Name: <input type="text" onBlur={(e)=>{this.setState({name:e.target.value})}}></input><br></br>
                   Book Cost: <input type="number" onBlur={(e)=>{this.setState({cost:e.target.value})}}></input><br></br>
                <button onClick={()=>{this.updateData()}}>Update</button>
                </div>:null}
            </div>
        )
    }
}
