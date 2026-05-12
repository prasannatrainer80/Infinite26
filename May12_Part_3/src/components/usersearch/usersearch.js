import axios from 'axios';
import React, {Component, useState} from 'react';

const UserSearch = () => {

  const[userResult,setUserResult] = useState({})
  const[userId,setUserId] = useState(0)

  const handleChange = event => {
    setUserId(event.target.value);
  }

  const show = () => {
    let uid = parseInt(userId);
       axios.get("https://jsonplaceholder.typicode.com/users/" +uid).then(
      (response) => {
        setUserResult(response.data)
      }
    )
  }
  return(
    <div>
      <p>User Search Page</p>
      User Id : 
      <input type="number" name='userId' 
        value={userId} onChange={handleChange} /> 
        <br/><br/>
      <input type="button" value="Show" 
        onClick={show} /> 
      <hr/>

      User Id : <b> {userResult.id}</b> <br/>
      Name : <b>{userResult.name}</b><br/>
      User Name : <b>{userResult.username}</b><br/>
      Email : <b>{userResult.email}</b><br/>
      Phone : <b>{userResult.phone}</b><br/>
      Website : <b>{userResult.website}</b>

    </div>
  )
}

export default UserSearch;