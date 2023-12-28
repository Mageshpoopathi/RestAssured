const express = require('express');
const mobileRoutes=require('./routes/MobilePhones.js');
const loginRoutes=require('./routes/Login.js');
const app = express()
const port = 3000

//middlewares
app.use(express.json());
app.use(express.urlencoded({ extended: true }));

// app.set("query parser", "extended");
app.use((req,res, next)=>{
    console.log(`${req.method}:${req.url}`);
    next();
})
app.use('/login',loginRoutes);
app.use('/login/mobilePhones',mobileRoutes);



app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})