namespace 課題8
{
    partial class Form_Edit
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
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
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            button_Cancel = new Button();
            button_OK = new Button();
            label4 = new Label();
            label3 = new Label();
            label2 = new Label();
            label1 = new Label();
            numericUpDown_English = new NumericUpDown();
            numericUpDown_Mathematics = new NumericUpDown();
            numericUpDown_Japanese = new NumericUpDown();
            textBox1 = new TextBox();
            ((System.ComponentModel.ISupportInitialize)numericUpDown_English).BeginInit();
            ((System.ComponentModel.ISupportInitialize)numericUpDown_Mathematics).BeginInit();
            ((System.ComponentModel.ISupportInitialize)numericUpDown_Japanese).BeginInit();
            SuspendLayout();
            // 
            // button_Cancel
            // 
            button_Cancel.Location = new Point(197, 248);
            button_Cancel.Name = "button_Cancel";
            button_Cancel.Size = new Size(94, 29);
            button_Cancel.TabIndex = 18;
            button_Cancel.Text = "Cancel";
            button_Cancel.UseVisualStyleBackColor = true;
            // 
            // button_OK
            // 
            button_OK.DialogResult = DialogResult.OK;
            button_OK.Location = new Point(66, 248);
            button_OK.Name = "button_OK";
            button_OK.Size = new Size(94, 29);
            button_OK.TabIndex = 17;
            button_OK.Text = "OK";
            button_OK.UseVisualStyleBackColor = true;
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Location = new Point(44, 190);
            label4.Name = "label4";
            label4.Size = new Size(41, 20);
            label4.TabIndex = 16;
            label4.Text = "英語";
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(44, 135);
            label3.Name = "label3";
            label3.Size = new Size(41, 20);
            label3.TabIndex = 15;
            label3.Text = "数学";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(44, 86);
            label2.Name = "label2";
            label2.Size = new Size(41, 20);
            label2.TabIndex = 14;
            label2.Text = "国語";
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(44, 35);
            label1.Name = "label1";
            label1.Size = new Size(41, 20);
            label1.TabIndex = 13;
            label1.Text = "名前";
            // 
            // numericUpDown_English
            // 
            numericUpDown_English.Location = new Point(172, 188);
            numericUpDown_English.Name = "numericUpDown_English";
            numericUpDown_English.Size = new Size(150, 27);
            numericUpDown_English.TabIndex = 12;
            // 
            // numericUpDown_Mathematics
            // 
            numericUpDown_Mathematics.Location = new Point(172, 133);
            numericUpDown_Mathematics.Name = "numericUpDown_Mathematics";
            numericUpDown_Mathematics.Size = new Size(150, 27);
            numericUpDown_Mathematics.TabIndex = 11;
            // 
            // numericUpDown_Japanese
            // 
            numericUpDown_Japanese.Location = new Point(172, 84);
            numericUpDown_Japanese.Name = "numericUpDown_Japanese";
            numericUpDown_Japanese.Size = new Size(150, 27);
            numericUpDown_Japanese.TabIndex = 10;
            // 
            // textBox1
            // 
            textBox1.Location = new Point(172, 32);
            textBox1.Name = "textBox1";
            textBox1.ReadOnly = true;
            textBox1.Size = new Size(150, 27);
            textBox1.TabIndex = 19;
            // 
            // Form_Edit
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(375, 310);
            Controls.Add(textBox1);
            Controls.Add(button_Cancel);
            Controls.Add(button_OK);
            Controls.Add(label4);
            Controls.Add(label3);
            Controls.Add(label2);
            Controls.Add(label1);
            Controls.Add(numericUpDown_English);
            Controls.Add(numericUpDown_Mathematics);
            Controls.Add(numericUpDown_Japanese);
            Name = "Form_Edit";
            Text = "更新";
            ((System.ComponentModel.ISupportInitialize)numericUpDown_English).EndInit();
            ((System.ComponentModel.ISupportInitialize)numericUpDown_Mathematics).EndInit();
            ((System.ComponentModel.ISupportInitialize)numericUpDown_Japanese).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Button button_Cancel;
        private Button button_OK;
        private Label label4;
        private Label label3;
        private Label label2;
        private Label label1;
        private NumericUpDown numericUpDown_English;
        private NumericUpDown numericUpDown_Mathematics;
        private NumericUpDown numericUpDown_Japanese;
        private TextBox textBox1;
    }
}