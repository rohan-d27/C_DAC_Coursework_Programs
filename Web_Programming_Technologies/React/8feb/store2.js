import { createStore } from 'redux';

const MyDataReducer = (state = {username: '' }, action) => {

    if (action.type === "change") {
        let newuname = action.payload
        return { ...state, username: newuname }
    }
    return state



}

const store = createStore(MyDataReducer);
export default store;