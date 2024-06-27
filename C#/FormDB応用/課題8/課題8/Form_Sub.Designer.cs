namespace 課題8
{
    partial class Form_Sub
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
            textBox1 = new TextBox();
            listBox_Names = new ListBox();
            button_Regist = new Button();
            button_Edit = new Button();
            button_Delete = new Button();
            button_Close = new Button();
            SuspendLayout();
            // 
            // textBox1
            // 
            textBox1.Location = new Point(258, 26);
            textBox1.Name = "textBox1";
            textBox1.Size = new Size(125, 27);
            textBox1.TabIndex = 0;
            // 
            // listBox_Names
            // 
            listBox_Names.FormattingEnabled = true;
            listBox_Names.Location = new Point(26, 26);
            listBox_Names.Name = "listBox_Names";
            listBox_Names.Size = new Size(176, 244);
            listBox_Names.TabIndex = 1;
            listBox_Names.SelectedIndexChanged += listBox_Names_SelectedIndexChanged;
            // 
            // button_Regist
            // 
            button_Regist.Location = new Point(258, 79);
            button_Regist.Name = "button_Regist";
            button_Regist.Size = new Size(94, 29);
            button_Regist.TabIndex = 2;
            button_Regist.Text = "追加";
            button_Regist.UseVisualStyleBackColor = true;
            button_Regist.Click += button_Regist_Click;
            // 
            // button_Edit
            // 
            button_Edit.Location = new Point(258, 135);
            button_Edit.Name = "button_Edit";
            button_Edit.Size = new Size(94, 29);
            button_Edit.TabIndex = 3;
            button_Edit.Text = "更新";
            button_Edit.UseVisualStyleBackColor = true;
            button_Edit.Click += button_Edit_Click;
            // 
            // button_Delete
            // 
            button_Delete.Location = new Point(258, 189);
            button_Delete.Name = "button_Delete";
            button_Delete.Size = new Size(94, 29);
            button_Delete.TabIndex = 4;
            button_Delete.Text = "削除";
            button_Delete.UseVisualStyleBackColor = true;
            button_Delete.Click += button_Delete_Click;
            // 
            // button_Close
            // 
            button_Close.Location = new Point(258, 241);
            button_Close.Name = "button_Close";
            button_Close.Size = new Size(94, 29);
            button_Close.TabIndex = 5;
            button_Close.Text = "閉じる";
            button_Close.UseVisualStyleBackColor = true;
            button_Close.Click += button_Close_Click;
            // 
            // Form_Sub
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(button_Close);
            Controls.Add(button_Delete);
            Controls.Add(button_Edit);
            Controls.Add(button_Regist);
            Controls.Add(listBox_Names);
            Controls.Add(textBox1);
            Name = "Form_Sub";
            Text = "生徒名管理";
            Load += Form_Sub_Load;
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private TextBox textBox1;
        private ListBox listBox_Names;
        private Button button_Regist;
        private Button button_Edit;
        private Button button_Delete;
        private Button button_Close;
    }
}