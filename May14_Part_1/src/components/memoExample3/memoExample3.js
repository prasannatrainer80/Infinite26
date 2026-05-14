import React, {Component, useMemo, useState} from 'react';

const MemoExample3 = () => {

  const[days,setDays] = useState(0)
  const daySal = 8000 

  const payment = (days) => {
    return daySal * days;
  }

  const takehome = (days) => {
    return payment(days) - (payment(days)/10);
  }

  const actualAmount = useMemo(() => payment(days),[days])
  const takeHome = useMemo(() => takehome(days),[days])

  return(
    <div>
      <p>Memory Example 3</p>
       <label>Enter No.of Working Days </label>
      <input type="number" value={days} 
        onChange={ (e) => setDays(e.target.value)} /> 
        <br/><br/>
      Payment : <b>{actualAmount}</b>
      <br/>
      TakeHome : <b>{takeHome}</b>
    </div>
  )
}

export default MemoExample3