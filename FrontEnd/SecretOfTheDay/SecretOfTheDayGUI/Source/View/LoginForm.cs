using SecretOfTheDayGUI.Source.Controller;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SecretOfTheDayGUI
{
    public partial class LoginForm : Form
    {
        GuiController controller = new GuiController();

        public LoginForm()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {
             
        }

        private void LoginButton_Click(object sender, EventArgs e)
        {
            bool loginSucces = controller.Login(UserNameInputField.ToString(), UserPasswordInputField.ToString());
            if (loginSucces)
            {
                this.Close();
            }else
            {
                this.loginMessage.Text = "Username or password is incorrect!";
            } 
        }

        private void NewUserButton_Click(object sender, EventArgs e)
        {
            bool userCreationSucces = controller.CreateNewUser(UserNameInputField.ToString(); UserPasswordInputField.ToString());

            if (userCreationSucces)
            {
                this.Close();
            } else
            {
                this.loginMessage.Text = "User already exists!";
            }

        }
    }
}
