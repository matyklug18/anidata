import { Injectable } from '@angular/core';
import { Router } from "@angular/router";

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private route: Router) {
    // TODO make more robust
    for(var ck of document.cookie.split("; ")) {
      var ckt = ck.split("=");
      if(ckt[0] == "auth"){
        var txt = ckt[1].split(":");
        this.username = txt[0];
        this.password = txt[1];
      }
    }
    if(this.username != "") {
      this.route.navigate(["/main"]);
    }
  }

  username: string = "";
  password: string = "";

  login(username: string, password: string): void {
    this.username = username;
    this.password = password;
    document.cookie = "auth="+username+":"+password;
  }
}
