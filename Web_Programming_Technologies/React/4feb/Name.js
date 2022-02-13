import { useState } from "react";

function Name() {

    function camelize(str) {
        return str.replace(/(?:^\w|[A-Z]|\b\w)/g, 
        function(word, index) {
          return index === 0 ? word.toLowerCase() : word.toUpperCase();
        }).replace(/\s+/g, '');
      }

    const [name, setname] = useState('');
    const [ucase, setucase] = useState(false);
    const [lcase, setlcase] = useState(false);
    const [ccase, setccase] = useState(false);

    var uname='';
    var lname='';
    var cname='';
    if(ucase)
    uname=name.toUpperCase();

    if(lcase)
    lname=name.toLowerCase();

    if(ccase){
      cname=camelize(name);
    }
    

    return (  
        <div>
            <input type="text" onChange={(e)=>{setname(e.target.value)}}></input>
           Uppercase:  <input type="checkbox" value="ucase" onChange={(e)=>{setucase(e.target.checked)}}/>
           Lowercase:  <input type="checkbox" value="ucase" onChange={(e)=>{setlcase(e.target.checked)}}/>
           Camlecase:  <input type="checkbox" value="ucase" onChange={(e)=>{setccase(e.target.checked)}}/>
            <br></br>
            <pre><p>{uname}</p><p>{lname}</p><p>{cname}</p></pre>
        </div>
    );
}

export default Name;