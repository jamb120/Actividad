const express = require('Express'); //importacion del pacakge de express
const app =express();
//se crean las rutas para el servidor

app.get('/',(req,res) => {
    res.send('prueba de respues del servidor');
    //se crea la ruta por defecto para el servidor
});
//se configura la recepcion de escucha de peticiones
app.listen(3000);
