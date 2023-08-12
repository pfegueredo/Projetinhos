using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace DIO.ApiCatalogoJogos.Exceptions
{
    public class JogoJaCadastradoException: Exception
    {
        public JogoJaCadastradoException() : base("Este jogo já está cadastrado")
        { }
    }
}
