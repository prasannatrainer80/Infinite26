import axios from 'axios';
import React, {Component, useState} from 'react';

const EmploySearch = () => {

  const[employResult,setEmployResult] = useState({})
  const[empno,setEmpno] = useState(0)

  const handleChange = event => {
    setEmpno(event.target.value);
  }

  const show = () => {
    let eno = parseInt(empno);
       axios.get("http://localhost:9991/employ/searchEmploy/" +eno).then(
      (response) => {
        setEmployResult(response.data)
      }
    )
  }

  return(
    <div>
      <p>Employ Search Page</p>
      Employ Id : 
      <input type="number" name='empno' 
        value={empno} onChange={handleChange} /> 
        <br/><br/>
      <input type="button" value="Show" 
        onClick={show} /> 
      <hr/>

      Employ No : <b> {employResult.empno}</b> <br/>
      Name : <b>{employResult.name}</b><br/>
      Gender : <b>{employResult.gender}</b><br/>
      Department : <b>{employResult.dept}</b><br/>
      Designation : <b>{employResult.desig}</b><br/>
      Basic : <b>{employResult.basic}</b>

    </div>
  )
}

export default EmploySearch;