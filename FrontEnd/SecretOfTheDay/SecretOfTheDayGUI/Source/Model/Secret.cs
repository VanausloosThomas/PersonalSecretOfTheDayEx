using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SecretOfTheDayGUI.Source.Model
{
    class Secret
    {
        Image picture;
        string comment;

        public Secret(Image picture, string comment)
        {
            this.picture = picture;
            this.comment = comment;
        }
    }
}
