using SecretOfTheDayGUI.Source.Controller;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SecretOfTheDayGUI
{
    public partial class SubmitSecretForm : Form
    {
        GuiController controller = new GuiController();
        Image pictureToBeSaved;

        public SubmitSecretForm()
        {
            InitializeComponent();
        }

        private void OpenFileDialog(object sender, EventArgs e)
        {
            OpenFileDialog fileDialog = new OpenFileDialog();
            fileDialog.Filter = "JPG(*.JPG)|*.jpg";

            if(fileDialog.ShowDialog() == DialogResult.OK)
            {
                pictureToBeSaved = Image.FromFile(fileDialog.FileName);
            } else
            {
                //pop up a new form ? 
            }

        }

        private void SubmitSecretButton_Click(object sender, EventArgs e)
        {
            SecretCommentField.SaveFile("");
            //closes this forms and returns to the mainScreen!
            this.Close();

        }
    }
}
