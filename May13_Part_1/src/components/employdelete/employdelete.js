import React, {Component, useState} from 'react';
import Menu from '../menu/menu';
import axios from 'axios';

const EmployDelete = () => {
  const[empno,SetEmpno] = useState(0)

  const handleChange = event => {
    SetEmpno(event.target.value);
  }

  const empDelete = () => {
    let eid = parseInt(empno);

    axios.delete("http://localhost:9991/employ/deleteEmploy/"+eid).then(
       (response) => {
        alert(response.data);
        console.log(response.data);
       }
    )
  }

  return(
    <div>
      <Menu /> <hr/>
      <p>Employ Delete Page</p>
      Employ No : 
      <input type="number" name='empno' value={empno} onChange={handleChange} />
      <br/><br/>
      <input type="button" value="Delete" onClick={empDelete} /> <hr/>
      
    </div>
  )
}
export default EmployDelete