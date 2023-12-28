const{Router}=require('express');

const router=new Router();

var mobilePhones=[
    { 
        OsName:'Android',
        id:1,
        Version:10,
        Name:'oppo'
    },
    {
        OsName:'Android',
        Version:13,
        id:2,
        Name:'Samsung'
    },
    {
        OsName:'Ios',
        Version:8,
        id:3,
        Name:'Iphone 13'
    }
]

//normal GET routes
router.get('/',(req,res)=>{
    res.send(mobilePhones);
})
router.get('/test', (req, res) => {
    res.json(req.query);
  });


  //GET with query params
router.get('/ure',(req,res)=>{
    const filterValue=mobilePhones.filter((rev)=>rev.Version>=req.query.Version);
    res.json(filterValue);     
});
 

//GET request with route params
router.get('/:Name',(req,res)=>{
    const{Name}=req.params;
    const device=mobilePhones.find((dev)=>dev.Name===Name);
    res.send(device);
})

//normal POST routes
router.post('/',(req,res)=>{
    console.log(req.body);
    mobilePhones.push(req.body);
    res.send(201);
})
//normal put operations
router.put('/:id',(req,res)=>{
    const { id } = req.params;
    const { OsName, Version, Name } = req.body;

    const index = mobilePhones.findIndex(item => item.id == id);

    if (index !== -1) {
        // Update the fields if provided in the request body
        if (OsName) {
            mobilePhones[index].OsName = OsName;
        }
        if (Version) {
            mobilePhones[index].Version = Version;
        }
        if (Name) {
            mobilePhones[index].Name = Name;
        }

        res.status(200).json({ message: `Mobile phone updated successfully in id no : ${id}` });
    } else {
        res.status(404).json({ message: 'Mobile phone not found' });
    }
})
//normal delete operation
router.delete('/:id',(req,res)=>{
    var {id}= req.params;
    var index = mobilePhones.findIndex(item => item.id == id);
    if (index !== -1) {
        mobilePhones.splice(index,1);
    
        res.status(200).json({ message: `Mobile phone deleted successfully in id no : ${id}`});
      } else {
        res.status(404).json({ message: 'Mobile phone not found' });
      }
})





module.exports=router;