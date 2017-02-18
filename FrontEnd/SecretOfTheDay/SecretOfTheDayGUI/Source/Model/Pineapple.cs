using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SecretOfTheDayGUI.Source.Model
{
    class Pineapple
    {
        string name;
        string password;
        Secret secret;

        public Pineapple(string name, Secret secret)
        {
            this.name = name;
            this.secret = secret;
        }

        public void SetPassword(string password)
        {
            this.password = password;
        }
    }
}
