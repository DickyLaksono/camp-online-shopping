﻿namespace 課題13
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
            listBox_Names = new ListBox();
            button1 = new Button();
            SuspendLayout();
            // 
            // listBox_Names
            // 
            listBox_Names.FormattingEnabled = true;
            listBox_Names.Location = new Point(12, 12);
            listBox_Names.Name = "listBox_Names";
            listBox_Names.Size = new Size(548, 384);
            listBox_Names.TabIndex = 0;
            // 
            // button1
            // 
            button1.Location = new Point(242, 409);
            button1.Name = "button1";
            button1.Size = new Size(94, 29);
            button1.TabIndex = 1;
            button1.Text = "表示";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // Form_Main
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(573, 450);
            Controls.Add(button1);
            Controls.Add(listBox_Names);
            Name = "Form_Main";
            Text = "Form1";
            ResumeLayout(false);
        }

        #endregion

        private ListBox listBox_Names;
        private Button button1;
    }
}
