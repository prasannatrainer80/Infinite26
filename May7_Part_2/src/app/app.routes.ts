import { Routes } from '@angular/router';
import { Menu } from './menu/menu';
import { AddEmploy } from './add-employ/add-employ';
import { ShowEmploy } from './show-employ/show-employ';
import { GenerateToken } from './generate-token/generate-token';

export const routes: Routes = [
    {path:'',component:Menu},
    {path:'menu',component:Menu},
    {path:'menu',component:Menu,children:[
        {path:'addemploy',component:AddEmploy,outlet:'infinite'},
        {path:'showemploy',component:ShowEmploy,outlet:'infinite'},
        {path:'generatetoken',component:GenerateToken,outlet:'infinite'},
        
    ]}
];
