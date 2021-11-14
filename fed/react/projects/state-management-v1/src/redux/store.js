import { configureStore } from '@reduxjs/toolkit';
import nameReducer from './nameReducer';

export const store = configureStore({
    reducer: {
        name: nameReducer
    }
});