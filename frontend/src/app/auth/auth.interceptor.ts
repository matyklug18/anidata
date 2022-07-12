import { HttpEvent, HttpHandler, HttpInterceptor, HttpRequest } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';

import { LoginService } from '../login/login.service';

@Injectable()
export class AuthInterceptor implements HttpInterceptor {
  constructor(private login: LoginService) {}

  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    req = req.clone({
      setHeaders: {
        //https://stackoverflow.com/questions/56952405/how-to-decode-encode-string-to-base64-in-typescript-express-server

        'Authorization': `Basic ${btoa(this.login.username+":"+this.login.password)}`,
        //'Authorization': `Basic ${btoa("user"+":"+"user")}`,
      },
    });

    return next.handle(req);
  }
}
