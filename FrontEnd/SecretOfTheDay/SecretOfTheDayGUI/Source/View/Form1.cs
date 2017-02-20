using SecretOfTheDayGUI.Source.Controller;
using SecretOfTheDayGUI.Source.Model;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SecretOfTheDayGUI
{
    public partial class MainScreen : Form
    {
        GuiController controller = new GuiController(); 

        public MainScreen()
        {
            InitializeComponent();
            controller.init();
        }

        private void MainScreen_Load(object sender, EventArgs e)
        {
            //Entire method shoul go somewhere else ofcourse!

           /* var server = new HttpClient();
            server.BaseAddress = new Uri("http://localhost:50000/secretoftheday");
            server.DefaultRequestHeaders.Accept.Add(new MediaTypeWithQualityHeaderValue("application/json"));
            var response = server.GetAsync(server.BaseAddress + "/loginscreen").Result;
            if (response.IsSuccessStatusCode)
            {
                var data = response.Content.ReadAsStringAsync().Result;
                Pineapple pineapple = new Pineapple();
                Newtonsoft.Json.JsonConvert.PopulateObject(data.ToString(), pineapple);
            }
            */
        }

        private void uploadASecretToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form uploadForm = new SubmitSecretForm();
            uploadForm.ShowDialog();
        }
    }
}


