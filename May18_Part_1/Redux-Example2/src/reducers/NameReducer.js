const initialState = {
    sname : ''
}

const NameReducer = (state = initialState,action) => {
    switch(action.type) {
        case 'DEVA' :
            return {...state,sname:'Hi I am Deva Darshan...'}
        case 'NITISH' : 
            return {...state,sname :'Hi I am Nithish Lakshmi...'}
        case 'DHIVYA' : 
            return {...state,sname : 'Hi I am Dhivaya Sundar...'}
        default : 
            return state;
    }
}

export default NameReducer;