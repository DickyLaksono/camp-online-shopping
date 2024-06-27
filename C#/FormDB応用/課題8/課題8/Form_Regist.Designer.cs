namespace 課題8
{
    partial class Form_Regist
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
            numericUpDown_Japanese = new NumericUpDown();
            numericUpDown_Mathematics = new NumericUpDown();
            numericUpDown_English = new NumericUpDown();
            label1 = new Label();
            label2 = new Label();
            label3 = new Label();
            label4 = new Label();
            button_OK = new Button();
            button_Cancel = new Button();
            comboBox_Name = new ComboBox();
            ((System.ComponentModel.ISupportInitialize)numericUpDown_Japanese).BeginInit();
            ((System.ComponentModel.ISupportInitialize)numericUpDown_Mathematics).BeginInit();
            ((System.ComponentModel.ISupportInitialize)numericUpDown_English).BeginInit();
            SuspendLayout();
            // 
            // numericUpDown_Japanese
            // 
            numericUpDown_Japanese.Location = new Point(199, 128);
            numericUpDown_Japanese.Name = "numericUpDown_Japanese";
            numericUpDown_Japanese.Size = new Size(150, 27);
            numericUpDown_Japanese.TabIndex = 1;
            // 
            // numericUpDown_Mathematics
            // 
            numericUpDown_Mathematics.Location = new Point(199, 177);
            numericUpDown_Mathematics.Name = "numericUpDown_Mathematics";
            numericUpDown_Mathematics.Size = new Size(150, 27);
            numericUpDown_Mathematics.TabIndex = 2;
            // 
            // numericUpDown_English
            // 
            numericUpDown_English.Location = new Point(199, 232);
            numericUpDown_English.Name = "numericUpDown_English";
            numericUpDown_English.Size = new Size(150, 27);
            numericUpDown_English.TabIndex = 3;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(71, 79);
            label1.Name = "label1";
            label1.Size = new Size(41, 20);
            label1.TabIndex = 4;
            label1.Text = "名前";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(71, 130);
            label2.Name = "label2";
            label2.Size = new Size(41, 20);
            label2.TabIndex = 5;
            label2.Text = "国語";
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(71, 179);
            label3.Name = "label3";
            label3.Size = new Size(41, 20);
            label3.TabIndex = 6;
            label3.Text = "数学";
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Location = new Point(71, 234);
            label4.Name = "label4";
            label4.Size = new Size(41, 20);
            label4.TabIndex = 7;
            label4.Text = "英語";
            // 
            // button_OK
            // 
            button_OK.DialogResult = DialogResult.OK;
            button_OK.Location = new Point(93, 292);
            button_OK.Name = "button_OK";
            button_OK.Size = new Size(94, 29);
            button_OK.TabIndex = 8;
            button_OK.Text = "OK";
            button_OK.UseVisualStyleBackColor = true;
            button_OK.Click += button_OK_Click;
            // 
            // button_Cancel
            // 
            button_Cancel.Location = new Point(224, 292);
            button_Cancel.Name = "button_Cancel";
            button_Cancel.Size = new Size(94, 29);
            button_Cancel.TabIndex = 9;
            button_Cancel.Text = "Cancel";
            button_Cancel.UseVisualStyleBackColor = true;
            // 
            // comboBox_Name
            // 
            comboBox_Name.FormattingEnabled = true;
            comboBox_Name.Location = new Point(199, 76);
            comboBox_Name.Name = "comboBox_Name";
            comboBox_Name.Size = new Size(151, 28);
            comboBox_Name.TabIndex = 10;
            // 
            // Form_Regist
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(426, 384);
            Controls.Add(comboBox_Name);
            Controls.Add(button_Cancel);
            Controls.Add(button_OK);
            Controls.Add(label4);
            Controls.Add(label3);
            Controls.Add(label2);
            Controls.Add(label1);
            Controls.Add(numericUpDown_English);
            Controls.Add(numericUpDown_Mathematics);
            Controls.Add(numericUpDown_Japanese);
            Name = "Form_Regist";
            Text = "Form_Regist";
            Load += Form_Regist_Load;
            ((System.ComponentModel.ISupportInitialize)numericUpDown_Japanese).EndInit();
            ((System.ComponentModel.ISupportInitialize)numericUpDown_Mathematics).EndInit();
            ((System.ComponentModel.ISupportInitialize)numericUpDown_English).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private NumericUpDown numericUpDown_Japanese;
        private NumericUpDown numericUpDown_Mathematics;
        private NumericUpDown numericUpDown_English;
        private Label label1;
        private Label label2;
        private Label label3;
        private Label label4;
        private Button button_OK;
        private Button button_Cancel;
        private ComboBox comboBox_Name;
    }
}