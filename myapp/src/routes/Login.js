const{Router}=require('express');
const rout=new Router();

const Users=[
    {
        "USERNAME":"Magesh",
        "PASSWORD":"lion@208"
    },
    {
        "USERNAME":"poopathi",
        "PASSWORD":"mahi@208"
    },
    {
        "USERNAME":"abi",
        "PASSWORD":"abi@208"
    }
]
rout.get('/',(req,res)=>{
    res.send(Users);
});
rout.post('/',(req,res)=>{
    console.log(req.body);
    Users.push(req.body);
    res.send(201);
});
module.exports=rout;