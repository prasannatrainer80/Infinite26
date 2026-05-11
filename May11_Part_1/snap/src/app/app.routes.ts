import { Routes } from '@angular/router';
import { First } from './first/first';
import { Second } from './second/second';
import { Third } from './third/third';

export const routes: Routes = [
    {path:'',component:First},
    {path:'first',component:First,children:[
        {path:'second/:trainer/:company',component:Second,outlet:'infinite'},
        {path:'third/:trainer/:company',component:Third,outlet:'infinite'}
    ]}
    
];
