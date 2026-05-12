import React, {Component, useState} from 'react';
import Menu from '../menu/menu';

const Five = () => {

  const[count,setCount] = useState(0)

  const increment = () => {
    setCount(count+1)
  }

  const decrement = () => {
    setCount(count-1)
  }
  return(
    <div>
      <Menu /> <hr/>
      <input type="button" value="Increment" onClick={increment} />
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="button" value="Decrement" onClick={decrement} />
      <p>Count is : <b>{count}</b></p>
    </div>
  )
}
export default Five;