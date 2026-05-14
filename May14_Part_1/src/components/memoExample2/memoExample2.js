import React, {Component, useMemo, useState} from 'react';

const MemoExample2 = () => {

  const[name,setName] = useState("Welcome to React Programming...")
  
  const lowerCase  = (name) => {
    return name.toLowerCase();
  }

  const upperCase = (name) => {
    return name.toUpperCase();
  }

  const result1 = useMemo(() => lowerCase(name),[name])
  const result2 = useMemo(() => upperCase(name),[name])

  return(
    <div>
      <p>This is Memory Example 2</p>
      <p>Enter Your Name 
        <input type="text" name="name" value={name} 
            onChange={(e) => setName(e.target.value)} />
      </p> <hr/> 
      {result1} <br/>
      {result2}
    </div>
  )
}

export default MemoExample2;