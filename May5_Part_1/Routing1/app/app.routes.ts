import { Routes } from '@angular/router';
import { First } from './first/first';
import { Menu } from './menu/menu';
import { Second } from './second/second';
import { Third } from './third/third';
import { Four } from './four/four';
import { Five } from './five/five';
import { TwoWay } from './two-way/two-way';
import { Calc } from './calc/calc';

export const routes: Routes = [
    {path:'',component:Menu},
    {path:'first',component:First},
    {path:'second',component:Second},
    {path:'third',component:Third},
    {path:'four',component:Four},
    {path:'five',component:Five},
    {path:'twoway',component:TwoWay},
    {path:'calc',component:Calc}
];
