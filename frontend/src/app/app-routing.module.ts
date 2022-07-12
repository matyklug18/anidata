import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { MainComponent } from './main/main.component';
import { LongShowComponent } from './long-show/long-show.component';

const routes: Routes = [
	{ path: 'login', component: LoginComponent },
	{ path: 'main', component: MainComponent },
	{ path: 'show/:id', component: LongShowComponent },
	{ path: '**', redirectTo: "/login"},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
