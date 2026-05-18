import React, {Component} from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { deva, dhivya, nitish } from '../../actions/actions';

const Names = () => {

  const sname = useSelector((state) => state.sname)

  const dispatch = useDispatch()

  return(
    <div>
        <p>Student Name is : <b>{sname}</b></p>
        <input type="button" value="Deva" 
           onClick={() => dispatch(deva())} />
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="button" value="Nitish" 
          onClick={() => dispatch(nitish())} />
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="button" value="Dhivya" 
          onClick={() => dispatch(dhivya())} />
    </div>
  )
}

export default Names;