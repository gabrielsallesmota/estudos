//configurações do express (formato de classe)

import express from 'express';
import routes from './routes';
import cors from 'cors'
import mongoose from 'mongoose';

class App{

    constructor(){
        this.server = express();

        mongoose.connect('mongodb+srv://gabrielsallesmota:sallesmota@devstudy.pczvnin.mongodb.net/?retryWrites=true&w=majority&appName=devstudy'
        );

        
        this.middlewares();
        this.routes();
    }

    middlewares(){
        this.server.use(cors());
        this.server.use(express.json());
    }

    routes(){
        this.server.use(routes);
    }
}

export default new App().server;