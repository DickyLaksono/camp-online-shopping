namespace 課題1
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
            listView_Result = new ListView();
            button_Read = new Button();
            columnHeader1 = new ColumnHeader();
            columnHeader2 = new ColumnHeader();
            columnHeader3 = new ColumnHeader();
            columnHeader4 = new ColumnHeader();
            SuspendLayout();
            // 
            // listView_Result
            // 
            listView_Result.Columns.AddRange(new ColumnHeader[] { columnHeader1, columnHeader2, columnHeader3, columnHeader4 });
            listView_Result.FullRowSelect = true;
            listView_Result.GridLines = true;
            listView_Result.Location = new Point(25, 24);
            listView_Result.Name = "listView_Result";
            listView_Result.Size = new Size(752, 328);
            listView_Result.TabIndex = 0;
            listView_Result.UseCompatibleStateImageBehavior = false;
            listView_Result.View = View.Details;
            // 
            // button_Read
            // 
            button_Read.Location = new Point(650, 392);
            button_Read.Name = "button_Read";
            button_Read.Size = new Size(127, 29);
            button_Read.TabIndex = 1;
            button_Read.Text = "読み込み";
            button_Read.UseVisualStyleBackColor = true;
            button_Read.Click += button_Read_Click;
            // 
            // columnHeader1
            // 
            columnHeader1.Text = "名前";
            columnHeader1.Width = 200;
            // 
            // columnHeader2
            // 
            columnHeader2.Text = "国語";
            columnHeader2.Width = 90;
            // 
            // columnHeader3
            // 
            columnHeader3.Text = "数学";
            columnHeader3.Width = 90;
            // 
            // columnHeader4
            // 
            columnHeader4.Text = "英語";
            columnHeader4.Width = 90;
            // 
            // Form_Main
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(button_Read);
            Controls.Add(listView_Result);
            Name = "Form_Main";
            ResumeLayout(false);
        }

        #endregion

        private ListView listView_Result;
        private ColumnHeader columnHeader1;
        private ColumnHeader columnHeader2;
        private ColumnHeader columnHeader3;
        private ColumnHeader columnHeader4;
        private Button button_Read;
    }
}
