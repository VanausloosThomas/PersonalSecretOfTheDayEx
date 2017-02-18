using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SecretOfTheDayGUI.Source.Model
{
    class Guess
    {
        Pineapple voter;
        Pineapple votee;

        public Guess(Pineapple voter , Pineapple votee)
        {
            this.voter = voter;
            this.votee = votee;
        }
    }
}
