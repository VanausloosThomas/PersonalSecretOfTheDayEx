using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SecretOfTheDayGUI.Source.Model
{
    class UserInfo
    {
        string userName;
        string userPassword;

        public UserInfo(string userName, string userPassword)
        {
            this.userName = userName;
            this.userPassword = userPassword;
        }
    }
}
