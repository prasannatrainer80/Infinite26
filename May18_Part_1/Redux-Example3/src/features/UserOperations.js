import { createAsyncThunk, createSlice } from "@reduxjs/toolkit";
import axios from "axios";

export const fetchUsers = createAsyncThunk(
    'users/fetchUsers',
    async () => {

        const response = await axios.get(
            "https://jsonplaceholder.typicode.com/users"
        );

        return response.data;
    }
);

const UserOperations = createSlice({

    name: 'users',

    initialState: {
        userList: []
    },

    extraReducers: (builder) => {

        builder.addCase(
            fetchUsers.fulfilled,
            (state, action) => {

                state.userList = action.payload;
            }
        );
    },
});

export default UserOperations.reducer;