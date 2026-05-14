import React, {Component, useEffect, useRef, useState} from 'react';

const RefEx2 = () => {
  const [inputValue,setInputValue] = useState("")
  const count = useRef(0)

    useEffect(() => {
    count.current = count.current + 1;
   })
  return(
    <div>
      <p>This is Example for RefEx2</p>
        <input type="text" value={inputValue}
             onChange={ (e) => setInputValue(e.target.value)} />
             <p>
              How many Times Rendering Happend : <b>{count.current}</b>
             </p>
    </div>
  )

}
export default RefEx2;