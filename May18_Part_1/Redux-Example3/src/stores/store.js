import { configureStore } from "@reduxjs/toolkit";

import UserOperations from "../features/UserOperations";

export const store = configureStore({

    reducer: {
        users: UserOperations
    }

});