using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Text;
using System.Threading.Tasks;

namespace SecretOfTheDayGUI.Source.Model
{
    // sends all the REST calls to the server and remembers the state of the current program
    class UiSevice
    {
        private static UiSevice instance;
        Pineapple currentUser;
        HttpClient server;
        const string  BASEADRESS = "http://localhost:50000/secretoftheday";

        //singleton
        internal static UiSevice CreateService()
        {
            if (instance == null)
            {
                instance = new UiSevice();
            }
            return instance;
        }

        internal void init()
        {
            SetUpServer(BASEADRESS);
        }

        internal bool CreateNewUser(string userName, string userPassword)
        {
            return PostUserInfo("/new-user", userName, userPassword);
        }

        internal bool Login(string userName, string userPassword)
        {
            return PostUserInfo("/login", userName, userPassword);
        }

        private bool PostUserInfo(string additionToBaseAdress , string data1, string data2)
        {
            bool isSucces = false;

            StringContent dataToSend = new StringContent(data1 + " " + data2);
            HttpResponseMessage response = server.PostAsync(server.BaseAddress + additionToBaseAdress, dataToSend).Result;
            if (response.IsSuccessStatusCode)
            {
                isSucces = true;
                //var data = response.Content.ReadAsStringAsync().Result;
                //Pineapple pineapple = new Pineapple();
                //Newtonsoft.Json.JsonConvert.PopulateObject(data.ToString(), pineapple);
            }
            return isSucces;
        }

        public void SetUpServer(string baseAdress)
        {
            this.server = new HttpClient();
            server.BaseAddress = new Uri(baseAdress);
            server.DefaultRequestHeaders.Accept.Add(new MediaTypeWithQualityHeaderValue("application/json"));
        }
    }
}
