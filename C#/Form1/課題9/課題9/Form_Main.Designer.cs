namespace 課題9
{
    partial class Form_Main
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            label_Name = new Label();
            textBox_Name = new TextBox();
            button1 = new Button();
            button2 = new Button();
            openFileDialog1 = new OpenFileDialog();
            SuspendLayout();
            // 
            // label_Name
            // 
            label_Name.AutoSize = true;
            label_Name.Location = new Point(198, 125);
            label_Name.Name = "label_Name";
            label_Name.Size = new Size(141, 20);
            label_Name.TabIndex = 0;
            label_Name.Text = "名前を入れてください";
            // 
            // textBox_Name
            // 
            textBox_Name.Location = new Point(468, 125);
            textBox_Name.Name = "textBox_Name";
            textBox_Name.Size = new Size(125, 27);
            textBox_Name.TabIndex = 1;
            // 
            // button1
            // 
            button1.Location = new Point(198, 216);
            button1.Name = "button1";
            button1.Size = new Size(125, 29);
            button1.TabIndex = 2;
            button1.Text = "おみくじ読込";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // button2
            // 
            button2.Location = new Point(468, 216);
            button2.Name = "button2";
            button2.Size = new Size(125, 29);
            button2.TabIndex = 3;
            button2.Text = "おみくじを引く";
            button2.UseVisualStyleBackColor = true;
            button2.Click += button2_Click;
            // 
            // openFileDialog1
            // 
            openFileDialog1.FileName = "openFileDialog1";
            openFileDialog1.FileOk += openFileDialog1_FileOk;
            // 
            // Form_Main
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(button2);
            Controls.Add(button1);
            Controls.Add(textBox_Name);
            Controls.Add(label_Name);
            Name = "Form_Main";
            Text = "Form1";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label_Name;
        private TextBox textBox_Name;
        private Button button1;
        private Button button2;
        private OpenFileDialog openFileDialog1;
    }
}
