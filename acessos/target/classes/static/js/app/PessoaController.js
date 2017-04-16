'use strict';

angular.module('acessoApp').controller('PessoaController',
    ['PessoaService', '$scope',  function( PessoaService, $scope) {

        var self = this;
        self.pessoa = {};
        self.pessoas=[];

        self.submit = submit;
        self.getAllPessoas = getAllPessoas;
        self.createPessoa = createPessoa;
        self.updatePessoa = updatePessoa;
        self.removePessoa = removePessoa;
        self.editPessoa = editPessoa;
        self.reset = reset;

        self.successMessage = '';
        self.errorMessage = '';
        self.done = false;

        self.onlyIntegers = /^\d+$/;
        self.onlyNumbers = /^\d+([,.]\d+)?$/;

        function submit() {
            console.log('Submitting');
            if (self.pessoa.cpf === undefined || self.pessoa.cpf === null) {
                console.log('Saving New Person', self.pessoa);
                createUser(self.pessoa);
            } else {
                updatePessoa(self.pessoa, self.pessoa.cpf);
                console.log('User updated with cpf ', self.pessoa.cpf);
            }
        }
 
        function createPessoa(pessoa) {
            console.log('About to create person');
            PessoaService.createPessoa(pessoa)
                .then(
                    function (response) {
                        console.log('Person created successfully');
                        self.successMessage = 'Person created successfully';
                        self.errorMessage='';
                        self.done = true;
                        self.pessoa={};
                        $scope.myForm.$setPristine();
                    },
                    function (errResponse) {
                        console.error('Error while creating User');
                        self.errorMessage = 'Error while creating User: ' + errResponse.data.errorMessage;
                        self.successMessage='';
                    }
                );
        }
 
 
        function updatePessoa(pessoa, cpf){
            console.log('About to update person');
            PessoaService.updatePessoa(pessoa, cpf)
                .then(
                    function (response){
                        console.log('Persor updated successfully');
                        self.successMessage='Person updated successfully';
                        self.errorMessage='';
                        self.done = true;
                        $scope.myForm.$setPristine();
                    },
                    function(errResponse){
                        console.error('Error while updating pessoa');
                        self.errorMessage='Error while updating pessoa '+errResponse.data;
                        self.successMessage='';
                    }
                );
        }
 
 
        function removePessoa(cpf){
            console.log('About to remove User with cpf '+cpf);
            PessoaService.removePessoa(cpf)
                .then(
                    function(){
                        console.log('pessoa '+cpf + ' removed successfully');
                    },
                    function(errResponse){
                        console.error('Error while removing pessoa '+cpf +', Error :'+errResponse.data);
                    }
                );
        }
 
 
        function getAllPessoas(){
            return PessoaService.getAllPessoas();
        }
 
        function editPessoa(cpf) {
            self.successMessage='';
            self.errorMessage='';
            PessoaService.getPessoa(cpf).then(
                function (pessoa) {
                    self.pessoa = pessoa;
                },
                function (errResponse) {
                    console.error('Error while removing user ' + cpf + ', Error :' + errResponse.data);
                }
            );
        }
        function reset(){
            self.successMessage='';
            self.errorMessage='';
            self.person={};
            $scope.myForm.$setPristine(); //reset Form
        }
    }


    ]);