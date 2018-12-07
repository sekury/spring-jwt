Generate RSA private key:
```
openssl genrsa -out private.pem 2048
```

Get token
```
GET http://localhost:8080/jwt
```

Validate token:
```
POST http://localhost:8080/jwt/validate
Content-Type: text/plain

eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJzZWt1cnkifQ.QPyxGFuLLxLxsSJ-HWpNbNcWzcV7S47RYDbOnvmxn-8VmI7Js6F29ulWXqJsrK0Nhax4vP_Bry3nbWlRHNTvnClczRcMIiDwZKVjITn91_W_I3bZHUthKIVI3MfbN_iouRr0XmTaa9oLVUYA8xu3MTohC2upznNbBAFpI8_GoBtYo4q6cQnMMMSAjdM1jNHsZDlbk4ahxO_a48q5n65blro0P2FQCzoQvmrkAhJNjcohiw9WpBD3KjKkRBsvJESeNjdOrpsjg6ctUFtDbkfeOx9tDhMmZyimjXDB0C-xlzVtZqnjOtUiEF2jepgijs7KoP-OSwCA5S_h_Msafzgesg
```