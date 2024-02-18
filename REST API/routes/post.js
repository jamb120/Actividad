const post = require("../models/post");

router.post('/',async(req,res)=>{
    //request para el post en consola
    const post =new post({
        title: req.body.title,
        description: req.body.description
    });
    try {const savedPost =await post.save();
        //guadar en la BD
        res.json(savedPost);
        
    } catch (error) {
        res.json({message:error});
    }

});

router.get('/:postId',async(req,res) => {
    //guadar en usuario en la BD
    try {
        const post =await post.findById(
            req.params.postId
        );
        res.json(post);
    } catch (error) {
        res.json({message:error});
    }

});

router.delete('/:postId',async(req,res) => {
    //elimina de la BD
    try {
        const removedPost =await post.remove(
            {_id: req.params.postId}
        );
        res.json(removedPost);
    } catch (error) {
        res.json({message:error});
    }
    
});

router.patch('/:postId',async(req,res) => {
    //actualiza informacion de la base de datos
    try {
        const updatePost =await post.updateOne(
            {_id: req.params.postId},
            {$set: {title: req.body.title}}
        );
        res.json(updatePost);
    } catch (error) {
        res.json({message:error});
    }
    
});

module.exports = router;
