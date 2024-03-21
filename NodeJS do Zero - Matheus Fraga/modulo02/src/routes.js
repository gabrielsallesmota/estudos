import { Router } from 'express';

import SessionController from './controllers/SessionController';
import HouseController from './controllers/HouseController';
import DashboardController from './controllers/DashboardController';
import ReserveController from './controllers/ReserveController';

const routes = new Router(); 

routes.post('/sessions', SessionController.store);

routes.post('/houses', HouseController.store);
routes.get('/houses', HouseController.index);
routes.put('/houses/:house_id', HouseController.update);
routes.delete('/houses', HouseController.destroy);

routes.get('/dashboard', DashboardController.show)

routes.post('/house/:house_id/reserve', ReserveController.store)
routes.get('/reserves', ReserveController.index)
routes.delete('/reserves/cancel', ReserveController.destroy)


export default routes;