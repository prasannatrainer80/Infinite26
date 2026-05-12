import React, {Component, useState} from 'react';
import Menu from '../menu/menu';

const Four = () => {

  const [name,setName]=useState('')

  const naveen = () => {
    setName("Hi I am Naveen...");
  }

  const mega = () => {
    setName("Hi I am Mega...")
  }

  const bawin = () => {
    setName("Hi I am Bawin...");
  }


  return(
    <div>
      <Menu /> <hr/>
      <input type="button" value="Naveen" onClick={naveen} />
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="button" value="Mega" onClick={mega} />
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="button" value="Bawin" onClick={bawin} />
      <hr />
      Name is : <b>{name}</b>
    </div>
  )
}

export default Four;