from flask import request, Response
from config.mongodb import mongo
from bson import json_util, ObjectId

def create_todo_service():
    data = request.get_json()
    usuario = data.get('usuario', None)
    contraseña = data.get('contraseña', None)
    if usuario : 
        response = mongo.db.UsuariosDB.insert_one({
            'usuario': usuario,
            'contraseña':contraseña,
            'guardado':True
        })
        result= {
            'id':str(response.inserted_id),
            'usuario': usuario,
            'contraseña':contraseña,
            'guardado':True
        }
        return result
    else:
        return 'invalid pyload', 400

def get_todos_service():
    data = mongo.db.UsuariosDB.find()
    result = json_util.dumps(data)
    return Response(result, mimetype='application/json')

def get_todo_service(id):
    data = mongo.db.UsuariosDB.find_one({'_id':ObjectId(id)})
    result = json_util.dumps(data)
    return Response(result, mimetype='application/json')

def update_todo_service(id):
    data = request.get_json()
    if request.get_json() ==0:
        return 'respuesta invalida', 400
    
    response = mongo.db.UsuariosDB.update_one({'_id':ObjectId(id)},{'$set':data})
    
    if response.modified_count >= 1:
        return 'todo fue actualizado', 200
    else: 'no se encontro el usuario', 400

def delete_todo_service(id):
    response= mongo.db.UsuariosDB.delete_one({'_id':ObjectId(id)})
    if response.deleted_count >= 1:
        return 'Usuario eliminado satisfactoriamente'
    else:
        return 'No se encontro el usuario a eliminar', 400