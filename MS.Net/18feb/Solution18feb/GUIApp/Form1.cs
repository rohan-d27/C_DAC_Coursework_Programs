using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace GUIApp
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            this.button1.Click += Button1_Click;
            this.button2.Click += Button2_Click;
            this.button3.Click += Button3_Click;
            this.button4.Click += Button4_Click;
        }

        private void Button4_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Button 4 is clicked...");
        }

        private void Button3_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Button 3 is clicked...");
        }

        private void Button2_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Button 2 is clicked...");

        }

        private void Button1_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Button 1 is clicked...");

        }
    }
}
