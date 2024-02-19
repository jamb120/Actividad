from flask import Flask, render_template
from routes.todo import todo
from dotenv import load_dotenv
import os
from config.mongodb import mongo

app = Flask(__name__)
#conexion a base de datos en mongoDB
load_dotenv()
app.config['MONGO_URI'] = os.getenv('MONGO_URI')
mongo.init_app(app)
#se crea el localhots donde estaremos trabajando los api

#se hace el llamado del index para la ruta principal
@app.route('/')
def index():
    return render_template('index.html')

#se hace el registro de los endpoints 
app.register_blueprint(todo, url_prefix='/todo')

if __name__ == '__main__':
    app.run(debug=True)