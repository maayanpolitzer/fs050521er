import {createSlice} from '@reduxjs/toolkit';

const initialState = {
    value: "Maayan"
};

export const nameSlice = createSlice({
    name: 'name',
    initialState,
    reducers: {
        // to get the param from the function call ==> action.payload.
        changeName: (state, action) => {
            state.value = action.payload;
        },
        // if we do NOT need params for this function, no action required.
        clearName: (state) => {
            state.value = "";
        }
    }
});

export const {changeName, clearName} = nameSlice.actions;

export const nameData = (state) => state.name.value;

export default nameSlice.reducer;