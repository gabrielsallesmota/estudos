//metodos: index, show, update, store, destroy
/*
index: listagem de sessoes
store: criar nova sessao (novo login)
show: listar uma unica sessao (um unico login)
update: alterar/atualizar alguma sessao
destroy: para deletar uma sessão
*/

import User from '../models/User';

import * as Yup from 'yup';

class SessionController{
    async store (req, res){
        const schema = Yup.object().shape({
            email: Yup.string().email().required(),
        });
        
        const { email } = req.body;

        if(!(await schema.isValid(req.body))){
            return res.status(400).json({ error: "Insira um e-mail válido para login." })
        }

        //verificando se o o usuário já existe na base
        let user = await User.findOne({ email });

        //se não existir ele cria um novo
        if(!user){
            user = await User.create({ email });
        }

        //se exisitir ele retorna os dados mostrando que está logado
        return res.json(user);
    }
}

export default new SessionController();