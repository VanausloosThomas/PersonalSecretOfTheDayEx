using SecretOfTheDayGUI.Source.Model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SecretOfTheDayGUI.Source.Controller
{
    class GuiController
    {
        private UiSevice service = UiSevice.CreateService();


        internal bool Login(string userName, string userPassword)
        {
            bool succesFullPost = service.Login(userName, userPassword);
            return succesFullPost;
        }

        internal bool CreateNewUser(string userName, string userPassword)
        {
            bool succesFullPost = service.CreateNewUser(userName, userPassword);
            return succesFullPost;
        }

        internal void init()
        {
            service.init();
        }
    }
}
