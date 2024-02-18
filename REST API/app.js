const express = require('Express'); //importacion del pacakge de express
const app =express();
const mongoose = require('mongoose');
const bodyParser = require('body-parser');

//se llamn el body-parser
app.use(bodyParser.json());
//se importan las rutas
const postRoute = require('./routes/post');
app.use('/servicios',postRoute);

//se configura la recepcion de escucha de peticiones
app.listen(3000);
app.get('/',(req,res) => {
    res.send('prueba de respues del servidor');
    //se crea la ruta por defecto para el servidor
});
//conexion a la base de datos
mongoose.connect('mongodb+srv://jose:jose123@atlascluster.bdhdkr5.mongodb.net/',{useNewUrlParser:true}, ()=>{
    console.log('si hay conexion a la base de datos')
});