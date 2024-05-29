namespace WinFormsApp1計算アプリ
{
    partial class Form_main
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
            textBox_Answer = new TextBox();
            textBox_Number2 = new TextBox();
            textBox_Number1 = new TextBox();
            button_Diplay = new Button();
            label1 = new Label();
            label2 = new Label();
            SuspendLayout();
            // 
            // textBox_Answer
            // 
            textBox_Answer.Location = new Point(497, 135);
            textBox_Answer.Name = "textBox_Answer";
            textBox_Answer.Size = new Size(125, 27);
            textBox_Answer.TabIndex = 0;
            // 
            // textBox_Number2
            // 
            textBox_Number2.Location = new Point(255, 135);
            textBox_Number2.Name = "textBox_Number2";
            textBox_Number2.Size = new Size(125, 27);
            textBox_Number2.TabIndex = 1;
            // 
            // textBox_Number1
            // 
            textBox_Number1.Location = new Point(12, 135);
            textBox_Number1.Name = "textBox_Number1";
            textBox_Number1.Size = new Size(125, 27);
            textBox_Number1.TabIndex = 2;
            // 
            // button_Diplay
            // 
            button_Diplay.Location = new Point(528, 225);
            button_Diplay.Name = "button_Diplay";
            button_Diplay.Size = new Size(94, 29);
            button_Diplay.TabIndex = 3;
            button_Diplay.Text = "表示";
            button_Diplay.UseVisualStyleBackColor = true;
            button_Diplay.Click += button_Diplay_Click;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(188, 138);
            label1.Name = "label1";
            label1.Size = new Size(19, 20);
            label1.TabIndex = 4;
            label1.Text = "+";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(414, 142);
            label2.Name = "label2";
            label2.Size = new Size(19, 20);
            label2.TabIndex = 5;
            label2.Text = "=";
            // 
            // Form_main
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(label2);
            Controls.Add(label1);
            Controls.Add(button_Diplay);
            Controls.Add(textBox_Number1);
            Controls.Add(textBox_Number2);
            Controls.Add(textBox_Answer);
            Name = "Form_main";
            Text = "Form1";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private TextBox textBox_Answer;
        private TextBox textBox_Number2;
        private TextBox textBox_Number1;
        private Button button_Diplay;
        private Label label1;
        private Label label2;
    }
}
