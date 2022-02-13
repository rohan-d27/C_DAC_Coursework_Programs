import { createStore } from "redux";

const initialState = { counter: 0, userName: 'Rohan' };


const exampleReducer = (state = initialState, action) => {
    if (action.type === 'increase') {
        return {
            counter: state.counter + 2,
            userName: state.userName
        }
    }
    else if (action.type === 'setUserName') {
        return {
            counter: state.counter,
            userName: action.value
        }
    }
    else if (action.type === 'decrease')
    {
        return {
            counter: state.counter -2,
            userName: state.userName
        }
    }
    else if (action.type === 'setEnteredNumber'){
       const num=parseInt(action.value)
        return {
            counter: num,
            userName: state.userName
        }
    }
    return state;
}
const store = createStore(exampleReducer);
export default store;
